class ResistorColor {
    int colorCode(String color) {

for(int i = 0; i <= 9; i++)
if(color == colors()[i])
return i;
      return -1;   
    }

  String[] colors(){
   String[] colorsArray =     {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
      return colorsArray;
    }
}
