package lotto;

import java.util.List;

public class LottoView {
  public void printLottos(List<Lotto> lottos) {
    System.out.println(lottos.size() + "개를 구매했습니다.");
    for (Lotto lotto : lottos) {
      System.out.println(lotto.getNumbers());
    }
  }

  // TODO: 당첨 결과 출력 및 수익률 계산을 위한 메서드 추가
}
