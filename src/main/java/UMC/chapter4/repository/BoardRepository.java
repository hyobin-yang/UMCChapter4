package UMC.chapter4.repository;

import UMC.chapter4.model.Board;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

public class BoardRepository {

    private final List<Board> boards = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong(1);

    // 전체 게시글 조회
    public List<Board> findAll() {
        return new ArrayList<>(boards);
    }

    // ID로 게시글 조회
    public Optional<Board> findById(Long id) {
        return boards.stream()
                .filter(board -> board.getId().equals(id))
                .findFirst();
    }

    // 게시글 저장
    public Board save(Board board) {
        if (board.getId() == null) {
            board.setId(counter.getAndIncrement());
        }
        boards.add(board);
        return board;
    }

    // 게시글 삭제
    public void deleteById(Long id) {
        boards.removeIf(board -> board.getId().equals(id));
    }
}
