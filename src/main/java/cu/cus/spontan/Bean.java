package cu.cus.spontan;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;
;

// Класс бина
@Component
public class Bean {

    @PostConstruct
    public void init() {
        // Инициализация бина
        System.out.println("Инициализация бина через @PostConstruct");
    }

    @PreDestroy
    public void cleanup() {
        // Уничтожение бина
        System.out.println("Уничтожение бина через @PreDestroy");
    }

    // Дополнительные методы бизнес-логики
}
