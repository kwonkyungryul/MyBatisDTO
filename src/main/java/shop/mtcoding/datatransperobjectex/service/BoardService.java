package shop.mtcoding.datatransperobjectex.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.mtcoding.datatransperobjectex.dto.BoardDetailOutDtoV1Flattern;
import shop.mtcoding.datatransperobjectex.dto.BoardJoinUserDtoV2;
import shop.mtcoding.datatransperobjectex.dto.BoardJoinUserDtoV1;
import shop.mtcoding.datatransperobjectex.dto.BoardJoinUserDtoV3;
import shop.mtcoding.datatransperobjectex.model.board.BoardRepository;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardJoinUserDtoV2 viewPostDetailV1(Integer id) { // 서비스에서 dto 가공

        BoardDetailOutDtoV1Flattern flatDto = boardRepository.findByIdJoinUserV1(id);
        System.out.println("디버그 : " + flatDto.toString());
        BoardJoinUserDtoV2 ormDto = new BoardJoinUserDtoV2(flatDto);
        System.out.println("디버그 : " + ormDto.toString());

        return ormDto;
    }

    public BoardJoinUserDtoV1 viewPostDetailV2(Integer id) { // 서비스에서 dto 가공

        BoardJoinUserDtoV1 ormDto = boardRepository.findByIdJoinUserV2(id);
        System.out.println("디버그 : " + ormDto.toString());


        return ormDto;
    }

    public BoardJoinUserDtoV3 viewPostDetailV3(Integer id) { // 서비스에서 dto 가공

        BoardJoinUserDtoV3 ormDto = boardRepository.findByIdJoinUserV3(id);
        System.out.println("디버그 : " + ormDto.toString());

        return ormDto;
    }
}
