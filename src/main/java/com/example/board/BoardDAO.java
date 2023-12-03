package com.example.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<BoardVO> getBoardList(){
        String sql ="select * form BOARD order by seq desc";
        List<BoardVO> list = jdbcTemplate.query(sql,)
    }
}
