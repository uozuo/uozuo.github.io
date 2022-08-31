package chapter2;
public class MiGong {
    public static void main(String[] args) {
        int[][] map=new int[8][7];
        //设定1为障碍物，0为当前区域不是障碍物,2表示可以走的路，3表示之前的路走过，下一次无路可选
        //当map[6][5]==2时说明走出迷宫,采用的找路决策是 “下 右 上 左”
        for (int i=0;i< map.length;i++){
            for (int j=0;j< map[i].length;j++){
                if (i==0||i==7||j==0||j==6){
                    map[i][j]=1;
                }
            }
        }
        //用来设定起始障碍物
        map[3][1]=1;
        map[3][2]=1;
        //输出当前地图
        System.out.println("===========找路前的地图情况============");
        for (int i=0;i< map.length;i++){
            for (int j=0;j<map[i].length;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        M x=new M();
        x.findWay(map,1,1);
        System.out.println("===========找路后的地图情况============");
        for (int i=0;i< map.length;i++){
            for (int j=0;j<map[i].length;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class M {
    public boolean findWay(int [][]map,int i,int j){
        if(map[6][5]==2){
            return true;
        }else {
            if (map[i][j]==0){
                //表示如果这个位置可以走，走了之后打上印记2
                map[i][j]=2;
                if (findWay(map,i+1,j)){
                    //往下走一格
                    return true;
                }else if (findWay(map,i,j+1)){
                    return true;
                }else if (findWay(map,i-1,j)){
                    return true;
                }else if (findWay(map,i,j-1)){
                    return true;
                }else {
                    //如果下一格无路可选，就打上印记3
                    map[i][j]=3;
                    return false;
                }
            }else {
                return false;
            }
        }
    }
}
