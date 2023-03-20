package shop.mtcoding.datatransperobjectex.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import shop.mtcoding.datatransperobjectex.dto.BoardJoinUserDtoV2;
import shop.mtcoding.datatransperobjectex.dto.BoardJoinUserDtoV1;
import shop.mtcoding.datatransperobjectex.dto.BoardJoinUserDtoV3;
import shop.mtcoding.datatransperobjectex.service.BoardService;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService boardService;

    /*
        1. 평평한 DTO로 DB에서 응답받기
        2. 평평한 DTO를 ORM으로 변경하기
     */
    @GetMapping("/board/v1/{id}")
    public ResponseEntity<?> detail(@PathVariable Integer id) {
        BoardJoinUserDtoV2 dto = boardService.viewPostDetailV1(id);
        return ResponseEntity.ok().body(dto);
    }

    /*
        1. 외부 ResultMap을 통해 응답받기
     */

    @GetMapping("/board/v2/{id}")
    public ResponseEntity<?> detailV2(@PathVariable Integer id) {
        BoardJoinUserDtoV1 boardJoinUserDto = boardService.viewPostDetailV2(id);
        return ResponseEntity.ok().body(boardJoinUserDto);
    }

    /*
        1. 내부 ResultMap을 통해 응답 받기 (최종)
     */

    @GetMapping("/board/v3/{id}")
    public ResponseEntity<?> detailV3(@PathVariable Integer id) {
        BoardJoinUserDtoV3 boardJoinUserDto2 = boardService.viewPostDetailV3(id);
        return ResponseEntity.ok().body(boardJoinUserDto2);
    }
}
