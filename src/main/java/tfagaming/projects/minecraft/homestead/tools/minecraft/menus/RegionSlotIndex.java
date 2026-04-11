package tfagaming.projects.minecraft.homestead.tools.minecraft.menus;

public class RegionSlotIndex {
    public int index;
    public RegionSlotIndex(int startIndex){
        index = startIndex;
    }

    public void Next(){
        if(index == 16){
            index = 19;
        }
        else{
            index++;
        }
    }
}
