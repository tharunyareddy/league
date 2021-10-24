package com.example.service;

import java.util.List;
import com.example.model.Board;

public interface IBoardService {
	
	Board addBoard(Board board);

	void updateBoard(Board board);

	void deleteBoard(int boardId);

	Board getById(int boardId);

	List<Board> getAllBoard();
}
