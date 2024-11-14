package UMC.study.web.controller;

import UMC.study.service.BoardService;
import UMC.study.view.InputView;
import UMC.study.view.OutputView;
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
