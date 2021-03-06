package com.freeze.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.freeze.model.BoardModel;

public class BoardDaoImpl implements BoardDao {
	SqlSession sqlSession;
    
	public static String nameSpace = "pack.dao.BoardDao";

	@Override
	public List<BoardModel> boardList() throws Exception {
		return sqlSession.selectList(nameSpace + ".boadList");
	}
}