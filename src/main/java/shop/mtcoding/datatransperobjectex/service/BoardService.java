package shop.mtcoding.datatransperobjectex.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.mtcoding.datatransperobjectex.dto.BoardDetailOutDto;
import shop.mtcoding.datatransperobjectex.dto.BoardDetailOutDto2;
import shop.mtcoding.datatransperobjectex.model.board.BoardRepository;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardDetailOutDto2 viewPostDetail(Integer id) { // 서비스에서 dto 가공

        BoardDetailOutDto boardDetailOutDto = boardRepository.findByIdJoinUser(id);
        System.out.println("디버그 : " + boardDetailOutDto.toString());
        BoardDetailOutDto2 boardDetailOutDto2 = new BoardDetailOutDto2(boardDetailOutDto);
        System.out.println("디버그 : " + boardDetailOutDto2.toString());

        return boardDetailOutDto2;
    }
}
