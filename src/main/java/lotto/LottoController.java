package lotto;

import java.util.List;

public class LottoController {
  private final LottoView view;

  public LottoController(LottoView view) {
    this.view = view;
  }

  public void run(int amount) {
    List<Lotto> lottos = Lotto.purchaseLottos(amount);
    view.printLottos(lottos);

    // TODO: 당첨 번호 및 보너스 번호 입력 및 처리

    // TODO: 당첨 결과 출력 및 수익률 계산
  }
}
