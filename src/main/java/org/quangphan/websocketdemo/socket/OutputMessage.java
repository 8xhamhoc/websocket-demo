package org.quangphan.websocketdemo.socket;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OutputMessage {

    String from;
    String text;
    String time;

}
