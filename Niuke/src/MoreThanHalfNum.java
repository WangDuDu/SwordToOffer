/**
 *数组中出现次数超过一半的数字

 *数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 *由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。

**/


public class MoreThanHalfNum{
    public int MoreThanHalfNum_Solution(int [] array) {
        int length = array.length;
        if(length == 0)
            return 0;
        int result = array[0];
        int count = 1;//用来找出出现最多的数字
        int times = 0;//记录出现最多的数字的个数
        /*
         1.遍历数组的时候保存两个值，一个是数组中的一个可能出现最多的数字，另一个是次数count
         2.先判断count是否为零，如果为零则更新result的值为当前遍历到的数字。
         3.如果count不为零，判断下一个数字和之前保存的result是否相同，相同count加一，不同则减一
         4.遍历完成之后result中存的数字就是出现次数最多的数字
         5.最后判断出现次数最多的数字是否超过了数组长度的一半
        */
        for(int i = 1; i < length; i++){
            if(count == 0){
                result = array[i];
                count++;
            }
            else if(array[i] == result)
                count++;
            else
                count--;         
        }
        //判断出现最多的数字是不是超过了整个数组的一半
        for(int i = 0; i < length; i++){
            if(array[i] == result)
                times++;
        }
        if(times * 2 <= length)
            return 0;
        else
            return result;
    }
}