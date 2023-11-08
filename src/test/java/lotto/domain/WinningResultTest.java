package lotto.domain;

import lotto.domain.lotto.Lotto;
import lotto.domain.lotto.LottoNumber;
import lotto.domain.lotto.LottoTicket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WinningResultTest {

    WinningLotto winningLotto;
    LottoTicket lottoTicket;

    @BeforeEach
    void setUp(){
        winningLotto = new WinningLotto(new Lotto(List.of(1,2,3,4,5,6)));
        winningLotto.saveBonusNumber(LottoNumber.of(7));

        Lotto lotto1 = new Lotto(List.of(1, 2, 3, 4, 5, 6));
        Lotto lotto2 = new Lotto(List.of(1, 2, 3, 4, 5, 7));
        Lotto lotto3 = new Lotto(List.of(1, 2, 3, 4, 5, 10));
        Lotto lotto4 = new Lotto(List.of(1, 2, 3, 4, 10, 11));
        Lotto lotto5 = new Lotto(List.of(1, 2, 3, 10, 11, 12));
        Lotto lotto6 = new Lotto(List.of(1, 2, 10, 11, 12, 13));

        lottoTicket = LottoTicket.of(List.of(lotto1,lotto2,lotto3,lotto4,lotto5,lotto6));
    }

    @DisplayName("WinningResult 결과 저장 테스트")
    @ParameterizedTest
    @EnumSource(Ranking.class)
    void WinningResultTest(Ranking ranking){
       WinningResult winningResult =  WinningResult.from(lottoTicket,winningLotto);
        assertThat(winningResult.getWinningCount(ranking)).isEqualTo(1);
        //모든 Ranking이 1개씩 저장
    }


}