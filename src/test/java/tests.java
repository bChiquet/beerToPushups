import static org.assertj.core.api.Assertions.assertThat;

public class tests {

    @org.junit.Test
    public void when_I_drink_a_beer_I_must_do_5_pushups() {
        assertThat(pushupsPerBeer(1)).isEqualTo(5);
    }

    private Integer pushupsPerBeer(Integer beers) {
        return 5;
    }
}
