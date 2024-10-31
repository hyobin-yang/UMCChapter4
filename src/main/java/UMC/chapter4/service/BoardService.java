package UMC.chapter4.service;

import UMC.chapter4.model.Board;
import UMC.chapter4.repository.BoardRepository;

import java.util.List;
import java.util.Optional;

public class BoardService {
    private final BoardRepository boardRepository;

    // 생성자 주입
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    // 모든 게시글 조회
    public List<Board> getAllBoards() {
        return boardRepository.findAll();
    }

    // 특정 게시글 조회
    public Optional<Board> getBoardById(Long id) {
        return boardRepository.findById(id);
    }

    // 하나의 게시글 문자열
    public String getBoardInformation(Long id){
        Optional<Board> board = getBoardById(id);
        return board.get().toString();
    }

    // 게시글 생성
    public Board createBoard(String title, String content) {
        return boardRepository.save(new Board(null, title, content));
    }

    // 게시글 수정
    public Board updateBoard(Long id, String title, String content) {
        Optional<Board> optionalBoard = boardRepository.findById(id);
        if (optionalBoard.isPresent()) {
            Board board = optionalBoard.get();
            board.setTitle(title);
            board.setContent(content);
            return board;
        } else {
            throw new IllegalArgumentException("Board with id " + id + " not found.");
        }
    }

    // 게시글 삭제
    public void deleteBoard(Long id) {
        boardRepository.deleteById(id);
    }
}
