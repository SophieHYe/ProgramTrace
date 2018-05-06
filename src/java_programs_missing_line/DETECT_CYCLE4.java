package java_programs_missing_line;
import java.util.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java_programs_correct.Node;

/**
 *
 * @author derricklin
 */
public class DETECT_CYCLE4 {
    public static boolean detect_cycle(Node node) {
        Node hare = node;
        Node tortoise = node;

        while (true) {
            if (null==hare ||hare.getSuccessor() == null)
                return false;

            tortoise = tortoise.getSuccessor();
            hare = hare.getSuccessor().getSuccessor();

            if (hare == tortoise) {
              //  return true;
            }
        }
    }
}
