package UMC.chapter4.controller;

import UMC.chapter4.service.BoardService;
import UMC.chapter4.view.InputView;
import UMC.chapter4.view.OutputView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BoardController {

    private final BoardService boardService;

    // 생성자
    @Autowired
    public BoardController(final BoardService boardService) {
        this.boardService = boardService;
    }

    public void startBoardProgram(){
        String title = InputView.inputTitle();
        String content = InputView.inputContent();

        boardService.createBoard(title, content);

        String boardInfo = boardService.getBoardInformation(1L);
        OutputView.printBoardInformation(boardInfo);


    }


}
