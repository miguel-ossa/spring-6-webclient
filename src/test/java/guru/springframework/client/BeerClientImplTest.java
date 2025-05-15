package guru.springframework.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeerClientImplTest {

    @Autowired
    BeerClient client;

    @Test
    void listBeer() throws InterruptedException {
        client.listBeer().subscribe(System.out::println);

        Thread.sleep(1000L);
    }
}