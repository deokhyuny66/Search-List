package com.freeze.service;

import java.util.List;
import com.freeze.model.BoardModel;

public interface BoardService {
	public List<BoardModel> boardList() throws Exception;
}