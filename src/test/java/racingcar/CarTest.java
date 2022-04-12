package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class CarTest {
    private Car car;

    @BeforeEach
    void setUp(){
        car = new Car();
    }

    /**
     * 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
     */
    @DisplayName("전진 조건 테스트")
    @Test
    void random_count_test(){
        assertThat(car.isMove(() -> true)).isTrue();
        assertThat(car.isMove(() -> false)).isFalse();
    }


    @Test
    @DisplayName("전진 조건에 의한 이동거리 테스트")
    void move_test(){
        Car car = new Car();
        car.isMove(() -> true);
        car.isMove(() -> true);
        car.isMove(() -> true);
        assertThat(car.getDistance()).isEqualTo(3);
    }

    @Test
    @DisplayName("전진 조건에 의한 화면 표현 테스트")
    void show_distance_test(){
        Car car = new Car();
        car.isMove(() -> true);
        car.isMove(() -> true);
        car.isMove(() -> true);
        assertThat(car.getShowDistance()).isEqualTo("---");
    }
}