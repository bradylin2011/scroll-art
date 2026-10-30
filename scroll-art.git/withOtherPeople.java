public class withOtherPeople {

    //Lark's Giraffe

    public static char[][] getGiraffe() {
        char[][] img = new char[35][54];
        // fill with empty space
        for (int y = 0; y < 35; y++) {
            for (int x = 0; x < 54; x++) {
                img[y][x] = ' ';
            }
        }
        // then fill individual characters
        img[1][12] = 'o'; //added all this to code for the giraffe
        img[2][10] = 'o';
        img[2][11] = 'o';
        img[2][13] = 'o';
        img[2][14] = 'o';
        img[2][15] = 'o';
        img[3][10] = 'o';
        img[3][16] = 'o';
        img[4][10] = 'o';
        img[4][14] = '0';
        img[4][16] = 'o';
        img[4][17] = 'o';
        img[5][18] = 'o';
        img[5][10] = 'o';
        img[5][11] = 'x';
        img[5][12] = 'x';
        img[5][17] = 'o';
        img[5][18] = 'o';
        img[5][19] = 'o';
        img[6][10] = 'o';
        img[6][11] = 'x';
        img[6][12] = 'x';
        img[6][14] = 'x';
        img[6][15] = 'x';
        img[6][16] = 'x';
        img[6][17] = 'x';
        img[6][20] = 'o';
        img[6][21] = 'o';
        img[6][22] = 'o';
        img[7][10] = 'o';
        img[7][11] = 'x';
        img[7][12] = 'x';
        img[7][15] = 'x';
        img[7][16] = 'x';
        img[7][19] = 'x';
        img[7][20] = 'x';
        img[7][21] = 'x';
        img[7][22] = 'o';
        img[7][23] = 'o';
        img[8][10] = 'o';
        img[8][19] = 'x';
        img[8][20] = 'x';
        img[8][21] = 'x';
        img[8][22] = 'o';
        img[8][10] = 'o';
        img[9][10] = 'o';
        img[9][14] = 'o';
        img[9][15] = 'o';
        img[9][16] = 'o';
        img[9][17] = 'o';
        img[9][18] = 'o';
        img[9][19] = 'o';
        img[9][20] = 'o';
        img[10][10] = 'o';
        img[10][12] = 'x';
        img[10][13] = 'o';
        img[10][14] = 'o';
        img[10][15] = 'o';
        img[11][10] = 'o';
        img[11][11] = 'x';
        img[11][13] = 'o';
        img[12][10] = 'o';
        img[12][11] = 'x';
        img[12][13] = 'o';
        img[13][10] = 'o';
        img[13][12] = 'x';
        img[13][13] = 'o';
        img[14][10] = 'o';
        img[14][12] = 'x';
        img[14][11] = 'x';
        img[14][13] = 'o';
        img[15][10] = 'o';
        img[15][12] = 'x';
        img[15][13] = 'o';
        img[16][10] = 'o';
        img[16][13] = 'o';
        img[17][10] = 'o';
        img[17][12] = 'x';
        img[17][11] = 'x';
        img[17][13] = 'o';
        img[18][10] = 'o';
        img[18][12] = 'x';
        img[18][11] = 'x';
        img[18][13] = 'o';
        img[19][10] = 'o';
        img[19][12] = 'x';
        img[19][14] = 'o';
        img[19][13] = 'o';
        img[20][4] = 'o';
        img[20][5] = 'o';
        img[20][6] = 'o';
        img[20][7] = 'o';
        img[20][8] = 'o';
        img[20][9] = 'o';
        img[20][10] = 'o';
        img[20][13] = 'o';
        img[20][14] = 'o';
        img[20][15] = 'o';
        img[21][2] = 'o';
        img[21][3] = 'o';
        img[21][4] = 'x';
        img[21][5] = 'x';
        img[21][6] = 'x';
        img[21][11] = 'o';
        img[21][12] = 'o';
        img[21][13] = 'o';
        img[21][14] = 'o';
        img[21][15] = 'o';
        img[22][1] = 'o';
        img[22][2] = 'x';
        img[22][3] = 'x';
        img[22][5] = 'x';
        img[22][6] = 'x';
        img[22][12] = 'x';
        img[22][13] = 'x';
        img[22][14] = 'x';
        img[22][15] = 'o';
        img[22][16] = 'o';
        img[23][0] = 'o';
        img[23][2] = 'x';
        img[23][6] = 'x';
        img[23][7] = 'x';
        img[23][17] = 'o';
        img[24][0] = 'o';
        img[24][1] = 'x';
        img[24][2] = 'x';
        img[24][6] = 'x';
        img[24][7] = 'x';
        img[24][8] = 'x';
        img[24][9] = 'x';
        img[24][12] = 'x';
        img[24][13] = 'x';
        img[24][14] = 'x';
        img[24][15] = 'x';
        img[24][16] = 'x';
        img[24][17] = 'o';
        img[25][0] = 'o';
        img[25][7] = 'x';
        img[25][8] = 'x';
        img[25][13] = 'x';
        img[25][14] = 'x';
        img[25][15] = 'x';
        img[25][16] = 'o';
        img[26][1] = 'o';
        img[26][2] = 'o';
        img[26][3] = 'o';
        img[26][4] = 'o';
        img[26][5] = 'o';
        img[26][6] = 'o';
        img[26][7] = 'o';
        img[26][8] = 'o';
        img[26][9] = 'o';
        img[26][10] = 'o';
        img[26][11] = 'o';
        img[26][12] = 'o';
        img[26][13] = 'o';
        img[26][14] = 'o';
        img[26][15] = 'o';
        img[27][1] = 'o';
        img[27][2] = 'o';
        img[27][4] = 'o';
        img[27][5] = 'o';
        img[27][10] = 'o';
        img[27][11] = 'o';
        img[27][14] = 'o';
        img[27][15] = 'o';
        img[28][1] = 'o';
        img[28][2] = 'o';
        img[28][4] = 'o';
        img[28][5] = 'o';
        img[28][10] = 'o';
        img[28][11] = 'o';
        img[28][14] = 'o';
        img[28][15] = 'o';
        img[29][1] = 'o';
        img[29][2] = 'o';
        img[29][4] = 'o';
        img[29][5] = 'o';
        img[29][10] = 'o';
        img[29][11] = 'o';
        img[29][14] = 'o';
        img[29][15] = 'o';
        img[30][1] = 'o';
        img[30][2] = 'o';
        img[30][4] = 'o';
        img[30][5] = 'o';
        img[30][10] = 'o';
        img[30][11] = 'o';
        img[30][14] = 'o';
        img[30][15] = 'o';
        img[31][1] = 'o';
        img[31][2] = 'o';
        img[31][4] = 'o';
        img[31][5] = 'o';
        img[31][10] = 'o';
        img[31][11] = 'o';
        img[31][14] = 'o';
        img[31][15] = 'o';
        img[32][1] = 'o';
        img[32][2] = 'o';
        img[32][4] = 'o';
        img[32][5] = 'o';
        img[32][10] = 'o';
        img[32][11] = 'o';
        img[32][14] = 'o';
        img[32][15] = 'o';
        img[33][0] = 'L';
        img[33][1] = 'E';
        img[33][2] = 'D';
        return img;
    }

     //Viola's Turtle
        static char[][] getTurtle() {
         int TURTLE_WIDTH = 11;
        int TURTLE_HEIGHT = 9;
        char[][] img = new char[TURTLE_HEIGHT][TURTLE_WIDTH];
        // fill with empty space
        for (int y = 0; y < TURTLE_HEIGHT; y++) {
            for (int x = 0; x < TURTLE_WIDTH; x++) {
                img[y][x] = ' ';
            }
        }
        // then fill individual characters
        img[0][4] = '_';
        img[0][5] = '_';
        img[0][6] = '_';
        img[1][3] = '/';
        img[1][4] = '@';
        img[1][6] = '@';
        img[1][7] = '\\';

        img[2][3] = '\\';
        img[2][7] = '/';
        img[3][1] = '_';
        img[3][2] = '_';
        img[3][3] = '/';
        img[3][4] = '/';
        img[3][5] = '|';
        img[3][6] = '\\';
        img[3][7] = '\\';
        img[3][8] = '_';

        img[4][0] = '/';
        img[4][2] = '/';
        img[4][3] = '\\';
        img[4][4] = '\\';
        img[4][5] = '|';
        img[4][6] = '/';
        img[4][7] = '/';
        img[4][8] = '\\';
        img[4][10] = '\\';

        img[5][0] = '\\';
        img[5][1] = '/';
        img[5][2] = '\\';
        img[5][3] = '/';
        img[5][4] = '/';
        img[5][5] = '|';
        img[5][6] = '\\';
        img[5][7] = '\\';
        img[5][8] = '/';
        img[5][9] = '\\';
        img[5][10] = '/';

        img[6][3] = '\\';
        img[6][4] = '\\';
        img[6][5] = '|';
        img[6][6] = '/';
        img[6][7] = '/';

        img[7][4] = '/';
        img[7][5] = '/';
        img[7][6] = '\\';
        img[7][7] = '\\';
        img[8][4] = '-';
        img[8][7] = '-';

        return img; 
    }

    String title;
    String artist;
    char[][] img;
    int Rheight;
    int Rwidth;

    //This constructor deals with char arrays
    withOtherPeople(String title, String artist, char[][] art){
    this.title = title;
     this.artist = artist;
    img = art;
     Rheight = art.length;
    Rwidth = art[0].length;
    }
    

    //This constructor deals with String arrays, converts them to char. 
       withOtherPeople(String title, String artist, String art){
        this.title = title;
        this.artist = artist;
        String[] rows = art.split("\n");
        Rheight = rows.length;
        Rwidth = rows[0].length();

        for (int y = 1; y < Rheight; y++){
            if (rows[y].length() > Rwidth){
                Rwidth = rows[y].length();
            }
        }

        img = new char[Rheight][Rwidth];

        for (int y = 0; y < Rheight; y++){
            for (int x = 0; x < Rwidth; x++){
                img[y][x] = ' ';                 
            }
            char[] charR = rows[y].toCharArray();
            for (int x = 0; x < charR.length; x++){
                img[y][x] = charR[x];            
            }
        }
    }

//Robert's Rubix Cube
        public static String rubixCube(){
     return  """
               -----------------------------
           /\\         \\         \\        \\
          /  \\         \\         \\        \\
         /    \\         \\         \\        \\
        /      \\---------\\---------\\--------\\
       /\\     / \\         \\         \\        \\
      /  \\   /   \\         \\         \\        \\
     /    \\ /     \\         \\         \\        \\
    /      /       \\---------\\---------\\--------\\
   /\\     / \\     / \\         \\         \\        \\
  /  \\   /   \\   /   \\         \\         \\        \\
 /    \\ /     \\ /     \\         \\         \\        \\
/      /       /       -----------------------------
\\     / \\     / \\     /         /         /        /
 \\   /   \\   /   \\   /         /         /        /
  \\ /     \\ /     \\ /         /         /        /
   \\       /       /---------/---------/--------/
    \\     / \\     /         /         /        /
     \\   /   \\   /         /         /        /
      \\ /     \\ /         /         /        /
       \\       /---------/---------/--------/
        \\     /         /         /        /
         \\   /         /         /        /
          \\ /         /         /        /
ryc        -----------------------------
        """;

}

    void printImage(){
         for (int y = 0; y < Rheight; y++) {
            for (int x = 0; x < Rwidth; x++) {
                System.out.print(img[y][x]);
            }
            System.out.println();
        }
    }

void resize(int newHeight, int newWidth){
        char[][] newImg = new char[newHeight][newWidth];
        for (int y = 0; y < newHeight; y++){
        for (int x = 0; x < newWidth; x++){
                // this find the matching spot in the old grid and copy it
                newImg[y][x] = img[y * Rheight / newHeight][x * Rwidth / newWidth];
            }
        }
        img = newImg;         
        Rwidth = newWidth;     
        Rheight = newHeight;
        }


    public static void main(String[] args){
        for (int l = 0; l <= 10; l ++){
        withOtherPeople initials = new withOtherPeople("Initials","Brady",initials());
        initials.printImage();
        withOtherPeople rubixcube = new withOtherPeople("Rubix Cube","Robert",rubixCube());
        rubixcube.printImage();
        withOtherPeople getTurtle = new withOtherPeople("Turtle","Viola",getTurtle());
        getTurtle.printImage();
        withOtherPeople getGiraffe = new withOtherPeople("Turtle","Viola",getGiraffe());
        getGiraffe.resize(30,10);
        getGiraffe.printImage();
        withOtherPeople goat = new withOtherPeople("Goat","Brady",goat());
        goat.printImage();
        withOtherPeople bird = new withOtherPeople("Bird","Brady",bird());
        bird.printImage();
        }
    }

    public static char[][] bird() {
        int birdheight = 9;
        int birdlength = 29;
        char [][] img = new char[birdheight][birdlength];
        for (int y = 0; y < birdheight; y++){
            for (int x = 0; x <  birdlength; x++){
                img[y][x] = ' ';
            }
        }

        img[0][0] = '\\';
        img[0][1] = '\\';
        img[0][2] = '.';
        img[0][26] = '.';
        img[0][27] = '/';
        img[0][28] = '/';

        img[1][1] = '\\';
        img[1][2] = '\\';
        img[1][3] = '-';
        img[1][4] = '.';
        img[1][5] = '_';
        img[1][23] = '_';
        img[1][24] = '.';
        img[1][25] = '-';
        img[1][26] = '/';
        img[1][27] = '/';

        img[2][2] = '\\';
        img[2][3] = '\\';
        img[2][4] = '@';
        img[2][5] = '@';
        img[2][6] = '-';
        img[2][7] = '.';
        img[2][8] = '_';
        img[2][12] = '.';
        img[2][13] = '-';
        img[2][14] = '-';
        img[2][15] = '-';
        img[2][16] = '.';
        img[2][20] = '_';
        img[2][21] = '.';
        img[2][22] = '-';
        img[2][23] = '@';
        img[2][24] = '@';
        img[2][25] = '/';
        img[2][26] = '/';

        img[3][3] = '`';
        img[3][4] = '\\';
        img[3][5] = '@';
        img[3][6] = '@';
        img[3][7] = '@';
        img[3][8] = '@';
        img[3][9] = '@';
        img[3][10] = '-';
        img[3][11] = '(';
        img[3][13] = 'o';
        img[3][15] = 'o';
        img[3][17] = ')';
        img[3][18] = '-';
        img[3][19] = '@';
        img[3][20] = '@';
        img[3][21] = '@';
        img[3][22] = '@';
        img[3][23] = '@';
        img[3][24] = '/';
        img[3][25] = '\'';

        img[4][5] = '`';
        img[4][6] = '-';
        img[4][7] = '.';
        img[4][8] = '@';
        img[4][9] = '@';
        img[4][10] = '@';
        img[4][11] = '@';
        img[4][12] = '\\';
        img[4][14] = 'v';
        img[4][16] = '/';
        img[4][17] = '@';
        img[4][18] = '@';
        img[4][19] = '@';
        img[4][20] = '@';
        img[4][21] = '.';
        img[4][22] = '-';
        img[4][23] = '\'';

        img[5][8] = '`';
        img[5][9] = '-';
        img[5][10] = '.';
        img[5][11] = '@';
        img[5][12] = '@';
        img[5][13] = '@';
        img[5][14] = '@';
        img[5][15] = '@';
        img[5][16] = '@';
        img[5][17] = '@';
        img[5][18] = '.';
        img[5][19] = '-';
        img[5][20] = '\'';

        img[6][11] = '\\';
        img[6][12] = '@';
        img[6][13] = '@';
        img[6][14] = '@';
        img[6][15] = '@';
        img[6][16] = '@';
        img[6][17] = '/';

        img[7][12] = '|';
        img[7][13] = '\'';
        img[7][14] = '\'';
        img[7][15] = '\'';
        img[7][16] = '|';

        img[8][12] = '\'';
        img[8][13] = '\'';
        img[8][14] = '\'';
        img[8][15] = '\'';
        img[8][16] = '\'';

        return img;

    }

    public static char[][] goat() {
        int goatheight = 19;
        int goatlength = 21;
        char[][] img = new char[goatheight][goatlength];
        for (int y = 0; y < goatheight; y++){
            for (int x = 0; x < goatlength; x++){
                img[y][x] = ' ';
            }
        }

        img[0][6] = '#';
        img[0][9] = '#';
        img[0][10] = '#';

        img[1][5] = '#';
        img[1][8] = '#';

        img[2][4] = '#';
        img[2][7] = '#';

        
        img[3][4] = '#';
        img[3][7] = '#';

        img[4][0] = '<';
        img[4][1] = 'C';
        img[4][2] = 'C';
        img[4][3] = 'C';
        img[4][4] = 'C';
        img[4][5] = '-';
        img[4][6] = 'C';
        img[4][7] = 'C';
        img[4][8] = 'C';
        img[4][9] = 'C';
        img[4][10] = '-';
        img[4][11] = 'C';
        img[4][12] = 'C';
        img[4][13] = 'C';
        img[4][14] = '>';

        img[5][1] = 'Z';
        img[5][2] = '-';
        img[5][3] = '-';
        img[5][4] = '(';
        img[5][5] = '@';
        img[5][6] = ')';
        img[5][7] = '-';
        img[5][8] = '-';
        img[5][9] = '(';
        img[5][10] = '@';
        img[5][11] = ')';
        img[5][12] = '-';
        img[5][13] = 'Z';

        img[6][2] = 'Y';
        img[6][3] = '-';
        img[6][4] = '-';
        img[6][5] = '-';
        img[6][6] = '-';
        img[6][7] = '-';
        img[6][8] = '-';
        img[6][9] = '-';
        img[6][10] = '-';
        img[6][11] = '-';
        img[6][12] = '-';
        img[6][13] = 'Y';

        img[7][3] = 'J';
        img[7][4] = '-';
        img[7][5] = '-';
        img[7][6] = '-';
        img[7][7] = '-';
        img[7][8] = '-';
        img[7][9] = '-';
        img[7][10] = '-';
        img[7][11] = '-';
        img[7][12] = 'L';

        img[8][3] = 'J';
        img[8][4] = '-';
        img[8][5] = '-';
        img[8][6] = '-';
        img[8][7] = '-';
        img[8][8] = '-';
        img[8][9] = '-';
        img[8][10] = '-';
        img[8][11] = '-';
        img[8][12] = 'L';

        img[9][4] = 'J';
        img[9][5] = '-';
        img[9][6] = 'o';
        img[9][7] = '-';
        img[9][8] = '-';
        img[9][9] = 'o';
        img[9][10] = '-';
        img[9][11] = 'L';
        img[9][12] = '_';
        img[9][13] = '_';
        img[9][14] = '_';
        img[9][15] = '_';
        img[9][16] = '_';
        img[9][17] = '_';
        img[9][18] = '_';

        img[10][5] = '$';
        img[10][6] = '$';
        img[10][7] = '$';
        img[10][8] = '$';
        img[10][9] = '$';
        img[10][10] = '$';
        img[10][11] = 'N';
        img[10][12] = 'N';
        img[10][13] = 'N';
        img[10][14] = 'N';
        img[10][15] = 'N';
        img[10][16] = 'N';
        img[10][17] = 'N';
        img[10][18] = 'N';
        img[10][19] = '\\';
        img[10][20] = ',';

        img[11][6] = '$';
        img[11][7] = '$';
        img[11][8] = '$';
        img[11][9] = 'X';
        img[11][10] = 'X';
        img[11][11] = 'X';
        img[11][12] = 'X';
        img[11][13] = 'X';
        img[11][14] = 'X';
        img[11][15] = 'X';
        img[11][16] = 'X';
        img[11][17] = 'X';
        img[11][18] = 'X';
        img[11][19] = 'X';
        img[11][20] = 'X';

        img[12][6] = '$';
        img[12][7] = '$';
        img[12][8] = 'J';
        img[12][9] = '-';
        img[12][10] = '-';
        img[12][11] = '-';
        img[12][12] = '-';
        img[12][13] = '-';
        img[12][14] = '-';
        img[12][15] = '-';
        img[12][16] = '-';
        img[12][17] = '-';
        img[12][18] = '-';
        img[12][19] = '-';
        img[12][20] = 'X';

        img[13][7] = '$';
        img[13][8] = 'J';
        img[13][9] = '-';
        img[13][10] = '-';
        img[13][11] = '-';
        img[13][12] = '-';
        img[13][13] = '-';
        img[13][14] = '-';
        img[13][15] = '-';
        img[13][16] = '-';
        img[13][17] = '-';
        img[13][18] = '-';
        img[13][19] = '-';
        img[13][20] = 'X';

        img[14][8] = 'J';
        img[14][9] = '-';
        img[14][10] = 'Z';
        img[14][11] = 'Z';
        img[14][12] = '-';
        img[14][13] = '-';
        img[14][14] = '-';
        img[14][15] = '-';
        img[14][16] = '-';
        img[14][17] = 'Z';
        img[14][18] = 'Z';
        img[14][19] = '-';
        img[14][20] = 'Q';

        img[15][9] = 'Z';
        img[15][12] = 'Z';
        img[15][17] = 'Z';
        img[15][20] = 'Z';

        img[16][9] = 'Z';
        img[16][12] = 'Z';
        img[16][17] = 'Z';
        img[16][20] = 'Z';

        img[17][9] = 'Z';
        img[17][12] = 'Z';
        img[17][17] = 'Z';
        img[17][20] = 'Z';

        img[18][8] = 'M';
        img[18][9] = 'M';
        img[18][11] = 'M';
        img[18][12] = 'M';
        img[18][16] = 'M';
        img[18][17] = 'M';
        img[18][19] = 'M';
        img[18][20] = 'M';

        return img;
    }
            public static char[][] initials(){
        int initialsheight = 7;
        int initialslength = 9;
        char[][] img = new char[initialsheight][initialslength];
        for (int y = 0; y < initialsheight; y++){
            for (int x = 0; x < initialslength; x++){
                img[y][x] = ' ';
            }
        }

        img[0][0] = '#';
        img[0][1] = '#';
        img[0][2] = '#';
        img[0][3] = '#';
        img[0][5] = '#';

        img[1][0] = '#';
        img[1][3] = '#';
        img[1][5] = '#';

        img[2][0] = '#';
        img[2][3] = '#';
        img[2][5] = '#';

        img[3][0] = '#';
        img[3][1] = '#';
        img[3][2] = '#';
        img[3][3] = '#';
        img[3][5] = '#';

        img[4][0] = '#';
        img[4][3] = '#';
        img[4][5] = '#';

        img[5][0] = '#';
        img[5][3] = '#';
        img[5][5] = '#';

        img[6][0] = '#';
        img[6][1] = '#';
        img[6][2] = '#';
        img[6][3] = '#';
        img[6][5] = '#';
        img[6][6] = '#';
        img[6][7] = '#';
        img[6][8] = '#';
        return img;
    }

        }


        