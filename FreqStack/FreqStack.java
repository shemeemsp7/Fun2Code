// import java.util.ArrayList;
// import java.util.List;

// class FreqStack {

//     public static void main(String[] args) {
//          FreqStack freqStack = new FreqStack();
         
//         System.out.println(freqStack.getLargestIndex(5));
//         // FreqStack freqStack = new FreqStack();
//          freqStack.push(5); // The stack is [5]
//          freqStack.push(7); // The stack is [5,7]
//          freqStack.push(5); // The stack is [5,7,5]
//          freqStack.push(7); // The stack is [5,7,5,7]
//          freqStack.push(4); // The stack is [5,7,5,7,4]
//          freqStack.push(5); // The stack is [5,7,5,7,4,5]
//          System.out.println(freqStack.pop()); // return 5, as 5 is the most frequent. The stack becomes [5,7,5,7,4].
//          System.out.println(freqStack.pop()); // return 7, as 5 and 7 is the most frequent, but 7 is closest to the top. The
//          //                  // stack becomes [5,7,5,4].
//          System.out.println(freqStack.pop());// return 5, as 5 is the most frequent. The stack becomes [5,7,4].
//          System.out.println(freqStack.pop()); // return 4, as 4, 5 and 7 is the most frequent, but 4 is closest to the top.
//                           // The stack becomes [5,7].
//     }

//     private List<Integer> stack;
//     private List<Integer> mostFrequent = new ArrayList<Integer>();

//     public FreqStack() {
//         stack = new ArrayList<Integer>();
//     }

//     public void push(int val) {
//         stack.add(val);
//     }

//     public int pop() {
//         int result = 0;
//         if (!stack.isEmpty()) {
//             if (mostFrequent.size() == 0) {
//                 result = stack.remove(stack.size() - 1);
//                 mostFrequent.add(result);
//             } else {
//                 int index = this.getLargestIndex(mostFrequent);
//                 if(index + 1 == stack.size()){
//                     result = stack.remove(index-1);
//                     mostFrequent = result;
//                 }else{
//                     result= stack.remove(index+1);
//                     mostFrequent = result;
//                 }
//             }
//         }
//         return result;
//     }
//     private int getLargestIndex(List<Integer> mostFrequent){
//         List<Integer> temp = new ArrayList<Integer>(stack);
//         int returnIndex = 0;
//         for(int num: mostFrequent){
//             int index = temp.indexOf(num);
//             while(index >= 0){
//                 temp.set(index,-1);
//                 returnIndex = index;
//                 index = temp.indexOf(num);
//             }
//         }
//         return returnIndex;
//     }
// }