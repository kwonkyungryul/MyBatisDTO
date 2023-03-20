package shop.mtcoding.datatransperobjectex.model.board;

import org.apache.ibatis.annotations.Mapper;
import shop.mtcoding.datatransperobjectex.dto.BoardDetailOutDto;
import shop.mtcoding.datatransperobjectex.dto.BoardJoinUserDto;
import shop.mtcoding.datatransperobjectex.model.user.User;

import java.util.List;

@Mapper
public interface BoardRepository {
    public BoardJoinUserDto findByIdJoinUser2(int id);

    public BoardDetailOutDto findByIdJoinUser(int id);

    public int insert(Board board);

    public int updateById(Board board);

    public int deleteById(int id);

    public List<Board> findAll();

    public Board findById(int id);
}