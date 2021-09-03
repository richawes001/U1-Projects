import java.util.Scanner;

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */

    /* THE STORY: While playing Fortnite with the boyz, we did some pretty epic things. To start, I was rocking the (MARVEL Character) skin,
    someone was wearing the totally cool (TVShow/Movie) skin, and my best friend was (Pop culture character). Yes, you heard me correctly, (Pop culture character).
    We ended up getting a placement of (Placement of 1st-25th), when we fought a (DC Character),(VideoGame Character), and (YouTuber/Streamer/Music Artist). The fact this is possible,
    still blows me away.
    */

public class MadLib {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String mrvlCHAR, tvCHAR, popCHAR, dcCHAR, vidCHAR, iconCHAR;
        int placement;

        System.out.println("Please give a Marvel Franchise character.");
        mrvlCHAR = read.nextLine();

        System.out.println("Please give a TV Show or Movie character.");
        tvCHAR = read.nextLine();

        System.out.println("Please give a Pop Culture character.");
        popCHAR = read.nextLine();

        System.out.println("Please give a DC Franchise character.");
        dcCHAR = read.nextLine();

        System.out.println("Please give a Video Game character.");
        vidCHAR = read.nextLine();

        System.out.println("Please give a YouTuber, Streamer, or Music Artist.");
        iconCHAR = read.nextLine();

        System.out.println("Please give a whole number from 1 to 25.");
        placement = read.nextInt();

        System.out.println("While playing Fortnite with the boyz, we did some pretty epic things. To start, I was rocking the " + mrvlCHAR + " skin,\n" +
                "someone was wearing the totally cool " + tvCHAR +  " skin, and my best friend was " + popCHAR + ". Yes, you heard correctly, " + popCHAR + ".\n" +
                "We ended up getting a placement of " + placement + ", when we fought a " + dcCHAR + ", " + vidCHAR + ", and " + iconCHAR + ". The fact that this is possible,\n" +
                "still blows me away.");

    }

}
