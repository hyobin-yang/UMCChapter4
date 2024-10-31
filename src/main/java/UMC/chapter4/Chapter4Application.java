package UMC.chapter4;

import UMC.chapter4.controller.BoardController;
import UMC.chapter4.repository.BoardRepository;
import UMC.chapter4.service.BoardService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chapter4Application {
	public static void main(String[] args) {
		BoardRepository boardRepository = new BoardRepository();
		BoardService boardService = new BoardService(boardRepository);
		BoardController boardController = new BoardController(boardService);

		boardController.startBoardProgram();
	}

}


