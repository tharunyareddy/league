package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Board;
import com.example.repository.IBoardRepository;

@Service
public class BoardServiceImpl implements IBoardService {

	@Autowired
	IBoardRepository iBoardRepository;
	
	@Override
	public Board addBoard(Board board) {
		return iBoardRepository.save(board);
	}

	@Override
	public void updateBoard(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(int boardId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Board getById(int boardId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Board> getAllBoard() {
		// TODO Auto-generated method stub
		return null;
	}

}
