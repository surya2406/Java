// function should insert the data to the front of the list
struct Node *insert(struct Node *head, int data) {
    // Code here
    Node *temp = new Node(data);
    temp->npx = head;
    if(head)head->npx = XOR(temp,head->npx);
    return temp;
}

vector<int> getList(struct Node *head) {
    // Code here
    vector<int> ans;
    Node *curr=head,*prev=NULL,*nxt=NULL;
    while(curr){
        ans.push_back(curr->data);
        nxt = XOR(prev,curr->npx);
        prev=curr;
        curr=nxt;
    }
    return ans;
}
