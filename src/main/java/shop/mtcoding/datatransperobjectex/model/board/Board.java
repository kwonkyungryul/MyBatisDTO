package shop.mtcoding.datatransperobjectex.model.board;

import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.datatransperobjectex.model.user.User;

import java.sql.Timestamp;

@Getter @Setter
public class Board {
    private Integer id;
    private String title;
    private String content;
    private int userId;
    private Timestamp createdAt;
}
