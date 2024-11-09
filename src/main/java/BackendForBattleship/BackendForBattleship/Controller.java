package BackendForBattleship.BackendForBattleship;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class Controller {
    
     @MessageMapping("/connected/{gameId}")
    @SendTo("/topic/connected/{gameId}")
    public String connectedSignal(String signalString) {
        return signalString;
    }

    @MessageMapping("/readyUp/{gameId}")
    @SendTo("/topic/readyUp/{gameId}")
    public String readyUpSignal(String signalString) {
        return signalString;
    }

    @MessageMapping("/shot/{gameId}")
    @SendTo("/topic/shot/{gameId}")
    public String shotSignal(String signalInt) {
        return signalInt;
    }

    @MessageMapping("/hitOrMiss/{gameId}")
    @SendTo("/topic/hitOrMiss/{gameId}")
    public String hitOrMissSignal(String signalString) {
        return signalString;
    }

    @MessageMapping("/gameOver/{gameId}")
    @SendTo("/topic/gameOver/{gameId}")
    public String gameOverSignal(String signalString) {
        return signalString;
    }

}
