package com.esca.escahp.mapper;

import com.esca.escahp.dto.StudyBoardDto;
import com.esca.escahp.dto.UserDto;
import java.util.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudyBoardDao {
	List<StudyBoardDto> getStudyBoardList();

	public StudyBoardDto selectStudyBoard(Long id);

	public boolean addBoard(StudyBoardDto b);

	public boolean updateBoard(StudyBoardDto b);

/*
	// 게시글 삭제
	public int deleteStudyBoard(Long id){

	};

	// 게시글 목록 조회
	public List<StudyBoardDao> selectStudyBoardList(){

	};

	// 삭제 게시글 조회
	public int selectStudyBoardTotal(){

	};
	 */
}
