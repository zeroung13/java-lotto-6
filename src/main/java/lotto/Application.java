package lotto;

import camp.nextstep.edu.missionutils.Console;

public class Application {
  public static void main(String[] args) {
    System.out.println("구입금액을 입력해 주세요.");
    int amount = Integer.parseInt(Console.readLine());

    LottoView view = new LottoView();
    LottoController controller = new LottoController(view);
    controller.run(amount);
  }
}
