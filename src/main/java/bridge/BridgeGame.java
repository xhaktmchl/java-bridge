package bridge;

import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public String move(String inputMove, List<String> bridges, int curIdx) {
        String possibleMove="";
        if(inputMove.equals("U") && bridges.get(curIdx).equals("U")){ return "O"; }
        if(inputMove.equals("U") && bridges.get(curIdx).equals("D")){ return "X"; }
        if(inputMove.equals("D") && bridges.get(curIdx).equals("U")){ return "X"; }
        if(inputMove.equals("D") && bridges.get(curIdx).equals("D")){ return "O"; }
        return possibleMove;
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public boolean retry(String gameCommand) {
        boolean res = true;
        if(gameCommand.equals("Q")){
            return false;
        }
        if(gameCommand.equals("R")){
            return true;
        }
        return res;
    }
}
