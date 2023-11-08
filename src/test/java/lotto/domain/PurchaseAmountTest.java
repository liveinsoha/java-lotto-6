package lotto.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseAmountTest {

    @DisplayName("구입금액 1000원 단위 예외 테스트")
    @ParameterizedTest
    @ValueSource(ints = {1500, 2500, 3500})
    void validateDivisibleBy1000Test(int input) {
        Assertions.assertThatThrownBy(() -> {
                    PurchaseAmount.of(input);
                }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 구입금액은 1000원 단위이어야 합니다");
    }

    @DisplayName("구입금액 1000원 미만 예외 테스트")
    @ParameterizedTest
    @ValueSource(ints = {-1000, -2000, -3000})
    void validateIsGreaterThan1000Test(int input) {
        Assertions.assertThatThrownBy(() -> {
                    PurchaseAmount.of(input);
                }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 구입금액은 1000원 이상이어야 합니다");
    }
}