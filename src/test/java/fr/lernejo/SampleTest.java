package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SampleTest {

    @Test
    void test_fact() {
        Sample sample = new Sample();
        Assertions.assertThat(sample.fact(0)).isEqualTo(1);
        Assertions.assertThat(sample.fact(1)).isEqualTo(1);
        Assertions.assertThat(sample.fact(2)).isEqualTo(2);
        Assertions.assertThat(sample.fact(3)).isEqualTo(6);
        Assertions.assertThat(sample.fact(4)).isEqualTo(24);
        Assertions.assertThat(sample.fact(5)).isEqualTo(120);
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> sample.fact(-1));
    }

    @Test
    void test_op() {
        Sample sample = new Sample();
        Assertions.assertThat(sample.op(Sample.Operation.ADD, 1, 2)).isEqualTo(3);
        Assertions.assertThat(sample.op(Sample.Operation.ADD, -1, 2)).isEqualTo(1);
        Assertions.assertThat(sample.op(Sample.Operation.ADD, 1, -2)).isEqualTo(-1);
        Assertions.assertThat(sample.op(Sample.Operation.ADD, -1, -2)).isEqualTo(-3);
        Assertions.assertThat(sample.op(Sample.Operation.MULT, 2, 2)).isEqualTo(4);
        Assertions.assertThat(sample.op(Sample.Operation.MULT, -2, -2)).isEqualTo(4);
        Assertions.assertThat(sample.op(Sample.Operation.MULT,-2 , 2)).isEqualTo(-4);
        Assertions.assertThat(sample.op(Sample.Operation.MULT,2 , -2)).isEqualTo(-4);
    }

}
