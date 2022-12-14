class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root == null) return res;
        bfs(root, new StringBuilder(), res);
        return res;
    }
    private void bfs(TreeNode node, StringBuilder sb, List<String> res){
        if(node.left == null && node.right == null){
            sb.append(node.val);
            res.add(sb.toString());
            return;
        }else{
            sb.append(node.val + "->");
            if(node.left != null)   bfs(node.left, new StringBuilder(sb.toString()), res);
            if(node.right != null)   bfs(node.right, new StringBuilder(sb.toString()), res);
        }
    }
}