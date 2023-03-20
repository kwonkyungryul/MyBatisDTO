package shop.mtcoding.datatransperobjectex.model.board;

import org.apache.ibatis.annotations.Mapper;
import shop.mtcoding.datatransperobjectex.dto.BoardDetailOutDtoV1Flattern;
import shop.mtcoding.datatransperobjectex.dto.BoardJoinUserDtoV1;
import shop.mtcoding.datatransperobjectex.dto.BoardJoinUserDtoV3;

import java.util.List;

@Mapper
public interface BoardRepository {
    public BoardJoinUserDtoV3 findByIdJoinUserV3(int id);

    public BoardJoinUserDtoV1 findByIdJoinUserV2(int id);

    public BoardDetailOutDtoV1Flattern findByIdJoinUserV1(int id);

    public int insert(Board board);

    public int updateById(Board board);

    public int deleteById(int id);

    public List<Board> findAll();

    public Board findById(int id);
}