
class SmallestFromLeaf {
    public String smallestFromLeafToRoot(TreeNode root) {

        StringBuilder sb = new StringBuilder();
        if(root == null)
            return sb.toString();
        List<String>data =  new ArrayList();
        smallest(root,sb,data);
        String smallestString = findSmallestString(data);
        return smallestString;
    }
    private void smallest(TreeNode root,StringBuilder sb,List<String>data)
    {
        if (root == null)
            return;

        sb.append((char) ('a' + root.val));
        if(root.left== null && root.right == null)
        {
            data.add(sb.reverse().toString());
            sb.reverse();
        }
        else
        {
            smallest(root.left,sb,data);
            smallest(root.right,sb,data);
        }
        sb.deleteCharAt(sb.length()-1);
    }

    private String findSmallestString(List<String> ans)
    {
        String smallest = ans.get(0);
        for(String s : ans)
        {
            if(s.compareTo(smallest) < 0)
            {
                smallest = s;
            }
        }

        return smallest;
    }
}