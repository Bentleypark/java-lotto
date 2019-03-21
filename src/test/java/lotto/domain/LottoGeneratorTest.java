package lotto.domain;

import lotto.domain.ticket.LottoNumber;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoGeneratorTest {
    @Test
    public void 모든_로또_숫자_생성() {
        // given
        List<Integer> allLottoNumbers =
                IntStream.rangeClosed(LottoNumber.MIN_NUMBER, LottoNumber.MAX_NUMBER)
                        .boxed()
                        .collect(Collectors.toList());

        // when
        // then
        assertThat(LottoGenerator.getAllLottoNumbers())
                .containsExactlyElementsOf(allLottoNumbers);
    }

    @Test
    public void 로또_번호_정상_생성() {
        // 비정상 경우는 test: lotto.domain.ticket 테스트에서 걸림
        LottoGenerator.generate();
    }
}