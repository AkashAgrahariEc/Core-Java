package College;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExample {

    public static void main(String[] args) {

        // 🔹 Corrected Regex for 10-digit Phone Numbers
        Pattern myPattern = Pattern.compile("\\b\\d{10}\\b");

        Matcher myMatcher = myPattern.matcher("Rahul sat at his desk, staring at an old diary filled with random numbers—some short, some exactly 10 digits, and a few starting with 7, 8, or 94440056085. He flipped to the first page and saw 9524164090 written in bold letters, circled twice. Below it, another number caught his eye: 7012345678, followed by a 9444005608 smaller scribble that read 6352810974. He recalled receiving a call last week from 8123456789, but at the 9444000234 time, he thought it was a wrong number. As he turned the page, he found a list of numbers: 123456, 8745632109, 6789054321, and one particularly odd one, 9998887776. His mind raced—were these just random, or was there a hidden message? Just then, his phone lit up with an incoming call from 7694321085. Hesitating, he finally picked up, only to hear a mechanical voice say, “The key is in 6023456789.” His heart pounded as he realized these weren’t just numbers; they were coordinates, a code leading to something much bigger. The more he analyzed, the more patterns he found—numbers like 8543216789, 7456123980, and 6789012345 all seemed to fit into a strange sequence. Then, he noticed some other numbers scattered throughout the pages—1345678902, 2789012345, 3256789012, and 5123456789—all starting with 1, 2, 3, or 5. He was now certain that these numbers weren’t random at all. The puzzle was deeper than he had imagined, and every new sequence pulled him further into the mystery, making him wonder what secret they were all pointing toward.");

        System.out.println("These are the phone numbers from the given paragraph");
        while (myMatcher.find()) {
            System.out.println(myMatcher.group());
        }
    }
}
