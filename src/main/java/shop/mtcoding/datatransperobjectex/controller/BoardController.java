package shop.mtcoding.datatransperobjectex.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import shop.mtcoding.datatransperobjectex.dto.BoardDetailOutDto2;
import shop.mtcoding.datatransperobjectex.dto.BoardJoinUserDto;
import shop.mtcoding.datatransperobjectex.service.BoardService;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/board/{id}")
    public ResponseEntity<?> detail(@PathVariable Integer id) {
        BoardDetailOutDto2 dto = boardService.viewPostDetail(id);
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping("/board/v2/{id}")
    public ResponseEntity<?> detailV2(@PathVariable Integer id) {
        BoardJoinUserDto boardJoinUserDto = boardService.viewPostDetail2(id);
        return ResponseEntity.ok().body(boardJoinUserDto);
    }
}
