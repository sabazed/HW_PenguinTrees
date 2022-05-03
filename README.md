# Penguin Trees

<p>Trees are, besides lists, stacks and queues, another flexible data-structure with many applications.
In general, a tree consists of nodes which may hava multiple successors.
The topmost node which has no further predecessor is also called root node. The bottom nodes without successors are the
leaves. All other nodes are called internal.
Data are only stored in non-leaf nodes.</p>
<p>In this assignment a particular kind of trees is implemented, namely, sorted binary trees.
Binary trees are trees where each node either has two successors (<code>left</code> and <code>right</code>), or none.
Sorted means that at each node, the invariant holds that all elements stored in the left subtree
are less or equal to the element in the node, which in turn is less or equal to all elements in the right subtree.
Moreover, we want arbitrarily many elements to be stored inside the tree.</p>
<p>For the realization, we use the Composite pattern. In contrast to lists, we represent the empty data-structure not by means of
<code>null</code> but by an object of the class <code>Leaf</code>.
Consider the following UML diagram:</p>
<p><img alt="" src="https://syncandshare.lrz.de/dl/fiEVk7j6d7p7zQPQRESBMf8v/baeume.png"></p>
<p>The constructor of a tree should receive as parameter a
<a rel="noopener noreferrer" href="https://docs.oracle.com/javase/7/docs/api/java/util/Comparator.html">comparator</a>
which determines the ordering of the elements.
Initiall, <code>root</code> should be initialized as <code>Leaf</code>.
The constructor of class <code>InnerNode</code> receives <code>info</code> as parameter, while <code>left</code> and <code>right</code> are initialized
as <code>Leaf</code> objects.</p>
<p>When implementing any method, take care to exploit sortedness and inspec only those parts of the tree which are
really necessary.
The method <code>contains</code>, e.g., may not visit nodes which are excluded due to sortedness.</p>
<p>The methods are meant to do the following:</p>
<ul>
<li><div class="pe-task-0 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-ryu-c178=""><div _ngcontent-ryu-c178="" class="guided-tour">
    <!---->
    <!---->
    <fa-icon _ngcontent-ryu-c178="" size="lg" class="ng-fa-icon test-icon text-secondary ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-question" class="svg-inline--fa fa-circle-question fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M256 0C114.6 0 0 114.6 0 256s114.6 256 256 256s256-114.6 256-256S397.4 0 256 0zM256 400c-18 0-32-14-32-32s13.1-32 32-32c17.1 0 32 14 32 32S273.1 400 256 400zM325.1 258L280 286V288c0 13-11 24-24 24S232 301 232 288V272c0-8 4-16 12-21l57-34C308 213 312 206 312 198C312 186 301.1 176 289.1 176h-51.1C225.1 176 216 186 216 198c0 13-11 24-24 24s-24-11-24-24C168 159 199 128 237.1 128h51.1C329 128 360 159 360 198C360 222 347 245 325.1 258z"></path></svg></fa-icon><!---->
    <span _ngcontent-ryu-c178="" class="task-name ng-star-inserted">insert</span><!---->
    
</div>
</jhi-programming-exercise-instructions-task-status></div>adds the given element to the tree so that the invariant is preserved.
For that the comparator is passed around.
<code>null</code> should not be inserted into the tree.</li>
<li><div class="pe-task-1 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-ryu-c178=""><div _ngcontent-ryu-c178="" class="guided-tour">
    <!---->
    <!---->
    <fa-icon _ngcontent-ryu-c178="" size="lg" class="ng-fa-icon test-icon text-secondary ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-question" class="svg-inline--fa fa-circle-question fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M256 0C114.6 0 0 114.6 0 256s114.6 256 256 256s256-114.6 256-256S397.4 0 256 0zM256 400c-18 0-32-14-32-32s13.1-32 32-32c17.1 0 32 14 32 32S273.1 400 256 400zM325.1 258L280 286V288c0 13-11 24-24 24S232 301 232 288V272c0-8 4-16 12-21l57-34C308 213 312 206 312 198C312 186 301.1 176 289.1 176h-51.1C225.1 176 216 186 216 198c0 13-11 24-24 24s-24-11-24-24C168 159 199 128 237.1 128h51.1C329 128 360 159 360 198C360 222 347 245 325.1 258z"></path></svg></fa-icon><!---->
    <span _ngcontent-ryu-c178="" class="task-name ng-star-inserted">toString</span><!---->
    
</div>
</jhi-programming-exercise-instructions-task-status></div>returns all elements of the tree as comma separated <code>String</code>.
For that, a <a rel="noopener noreferrer" href="https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html">StringBuilder</a> is used.
<em>Hint: All tests rely on insert and toString! There are no dedicated tests for toString.</em></li>
<li><div class="pe-task-2 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-ryu-c178=""><div _ngcontent-ryu-c178="" class="guided-tour">
    <!---->
    <!---->
    <fa-icon _ngcontent-ryu-c178="" size="lg" class="ng-fa-icon test-icon text-secondary ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-question" class="svg-inline--fa fa-circle-question fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M256 0C114.6 0 0 114.6 0 256s114.6 256 256 256s256-114.6 256-256S397.4 0 256 0zM256 400c-18 0-32-14-32-32s13.1-32 32-32c17.1 0 32 14 32 32S273.1 400 256 400zM325.1 258L280 286V288c0 13-11 24-24 24S232 301 232 288V272c0-8 4-16 12-21l57-34C308 213 312 206 312 198C312 186 301.1 176 289.1 176h-51.1C225.1 176 216 186 216 198c0 13-11 24-24 24s-24-11-24-24C168 159 199 128 237.1 128h51.1C329 128 360 159 360 198C360 222 347 245 325.1 258z"></path></svg></fa-icon><!---->
    <span _ngcontent-ryu-c178="" class="task-name ng-star-inserted">size</span><!---->
    
</div>
</jhi-programming-exercise-instructions-task-status></div>returns the number of elements (InnerNodes) of the tree. The method should require no more than one line
in each class.</li>
<li><div class="pe-task-3 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-ryu-c178=""><div _ngcontent-ryu-c178="" class="guided-tour">
    <!---->
    <!---->
    <fa-icon _ngcontent-ryu-c178="" size="lg" class="ng-fa-icon test-icon text-secondary ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-question" class="svg-inline--fa fa-circle-question fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M256 0C114.6 0 0 114.6 0 256s114.6 256 256 256s256-114.6 256-256S397.4 0 256 0zM256 400c-18 0-32-14-32-32s13.1-32 32-32c17.1 0 32 14 32 32S273.1 400 256 400zM325.1 258L280 286V288c0 13-11 24-24 24S232 301 232 288V272c0-8 4-16 12-21l57-34C308 213 312 206 312 198C312 186 301.1 176 289.1 176h-51.1C225.1 176 216 186 216 198c0 13-11 24-24 24s-24-11-24-24C168 159 199 128 237.1 128h51.1C329 128 360 159 360 198C360 222 347 245 325.1 258z"></path></svg></fa-icon><!---->
    <span _ngcontent-ryu-c178="" class="task-name ng-star-inserted">remove</span><!---->
    
</div>
</jhi-programming-exercise-instructions-task-status></div>removes the given element from the tree.
If the element occur multiple times, exactly one occurrence should be deleted.
Subsequently, the invariant should again hold!
The procedure therefore is as follows:<ul>
<li>If the node holding the element to be removed, has just one or no <code>InnerNode</code> successor,
then it is replaced with the successor or a leaf node, respectively.</li>
<li>Otherwise, the node with the element to be removed, receives the element from the leftmost inner node of the
right subtree (i.e., the next element according to the ordering) and remove that node there.
An auxiliary method here might be convenient.</li></ul></li>
<li><div class="pe-task-4 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-ryu-c178=""><div _ngcontent-ryu-c178="" class="guided-tour">
    <!---->
    <!---->
    <fa-icon _ngcontent-ryu-c178="" size="lg" class="ng-fa-icon test-icon text-secondary ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-question" class="svg-inline--fa fa-circle-question fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M256 0C114.6 0 0 114.6 0 256s114.6 256 256 256s256-114.6 256-256S397.4 0 256 0zM256 400c-18 0-32-14-32-32s13.1-32 32-32c17.1 0 32 14 32 32S273.1 400 256 400zM325.1 258L280 286V288c0 13-11 24-24 24S232 301 232 288V272c0-8 4-16 12-21l57-34C308 213 312 206 312 198C312 186 301.1 176 289.1 176h-51.1C225.1 176 216 186 216 198c0 13-11 24-24 24s-24-11-24-24C168 159 199 128 237.1 128h51.1C329 128 360 159 360 198C360 222 347 245 325.1 258z"></path></svg></fa-icon><!---->
    <span _ngcontent-ryu-c178="" class="task-name ng-star-inserted">contains</span><!---->
    
</div>
</jhi-programming-exercise-instructions-task-status></div>checks whether the given element occurs somewhere in the data-structure.</li>
<li><div class="pe-task-5 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-ryu-c178=""><div _ngcontent-ryu-c178="" class="guided-tour">
    <!---->
    <!---->
    <fa-icon _ngcontent-ryu-c178="" size="lg" class="ng-fa-icon test-icon text-secondary ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-question" class="svg-inline--fa fa-circle-question fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M256 0C114.6 0 0 114.6 0 256s114.6 256 256 256s256-114.6 256-256S397.4 0 256 0zM256 400c-18 0-32-14-32-32s13.1-32 32-32c17.1 0 32 14 32 32S273.1 400 256 400zM325.1 258L280 286V288c0 13-11 24-24 24S232 301 232 288V272c0-8 4-16 12-21l57-34C308 213 312 206 312 198C312 186 301.1 176 289.1 176h-51.1C225.1 176 216 186 216 198c0 13-11 24-24 24s-24-11-24-24C168 159 199 128 237.1 128h51.1C329 128 360 159 360 198C360 222 347 245 325.1 258z"></path></svg></fa-icon><!---->
    <span _ngcontent-ryu-c178="" class="task-name ng-star-inserted">countMatches</span><!---->
    
</div>
</jhi-programming-exercise-instructions-task-status></div>returns the number of all elements in the tree which satisfy the given predicate <a rel="noopener noreferrer" href="https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html">predicate</a>.</li>
<li><div class="pe-task-6 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-ryu-c178=""><div _ngcontent-ryu-c178="" class="guided-tour">
    <!---->
    <!---->
    <fa-icon _ngcontent-ryu-c178="" size="lg" class="ng-fa-icon test-icon text-secondary ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-question" class="svg-inline--fa fa-circle-question fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M256 0C114.6 0 0 114.6 0 256s114.6 256 256 256s256-114.6 256-256S397.4 0 256 0zM256 400c-18 0-32-14-32-32s13.1-32 32-32c17.1 0 32 14 32 32S273.1 400 256 400zM325.1 258L280 286V288c0 13-11 24-24 24S232 301 232 288V272c0-8 4-16 12-21l57-34C308 213 312 206 312 198C312 186 301.1 176 289.1 176h-51.1C225.1 176 216 186 216 198c0 13-11 24-24 24s-24-11-24-24C168 159 199 128 237.1 128h51.1C329 128 360 159 360 198C360 222 347 245 325.1 258z"></path></svg></fa-icon><!---->
    <span _ngcontent-ryu-c178="" class="task-name ng-star-inserted">getAll</span><!---->
    
</div>
</jhi-programming-exercise-instructions-task-status></div>returns all elements satisfying the predicate, as an array.
The parameter <code>index</code> specifies the respective next empty entry of the array.
The elements should occur inside the array in exactly the same order as in the tree.</li>
</ul>
<p>Realize a class <code>PenguinTrees</code> which provides the following methods:</p>
<ul>
<li><div class="pe-task-7 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-ryu-c178=""><div _ngcontent-ryu-c178="" class="guided-tour">
    <!---->
    <!---->
    <fa-icon _ngcontent-ryu-c178="" size="lg" class="ng-fa-icon test-icon text-secondary ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-question" class="svg-inline--fa fa-circle-question fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M256 0C114.6 0 0 114.6 0 256s114.6 256 256 256s256-114.6 256-256S397.4 0 256 0zM256 400c-18 0-32-14-32-32s13.1-32 32-32c17.1 0 32 14 32 32S273.1 400 256 400zM325.1 258L280 286V288c0 13-11 24-24 24S232 301 232 288V272c0-8 4-16 12-21l57-34C308 213 312 206 312 198C312 186 301.1 176 289.1 176h-51.1C225.1 176 216 186 216 198c0 13-11 24-24 24s-24-11-24-24C168 159 199 128 237.1 128h51.1C329 128 360 159 360 198C360 222 347 245 325.1 258z"></path></svg></fa-icon><!---->
    <span _ngcontent-ryu-c178="" class="task-name ng-star-inserted">getAgeTree</span><!---->
    
</div>
</jhi-programming-exercise-instructions-task-status></div>returns an empty tree in which penguins are ordered according to their age (youngest first);</li>
<li><div class="pe-task-8 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-ryu-c178=""><div _ngcontent-ryu-c178="" class="guided-tour">
    <!---->
    <!---->
    <fa-icon _ngcontent-ryu-c178="" size="lg" class="ng-fa-icon test-icon text-secondary ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-question" class="svg-inline--fa fa-circle-question fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M256 0C114.6 0 0 114.6 0 256s114.6 256 256 256s256-114.6 256-256S397.4 0 256 0zM256 400c-18 0-32-14-32-32s13.1-32 32-32c17.1 0 32 14 32 32S273.1 400 256 400zM325.1 258L280 286V288c0 13-11 24-24 24S232 301 232 288V272c0-8 4-16 12-21l57-34C308 213 312 206 312 198C312 186 301.1 176 289.1 176h-51.1C225.1 176 216 186 216 198c0 13-11 24-24 24s-24-11-24-24C168 159 199 128 237.1 128h51.1C329 128 360 159 360 198C360 222 347 245 325.1 258z"></path></svg></fa-icon><!---->
    <span _ngcontent-ryu-c178="" class="task-name ng-star-inserted">getHeightTree</span><!---->
    
</div>
</jhi-programming-exercise-instructions-task-status></div>returns an empty tree in which penguins are ordered according to their height (tallest first);</li>
<li><div class="pe-task-9 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-ryu-c178=""><div _ngcontent-ryu-c178="" class="guided-tour">
    <!---->
    <!---->
    <fa-icon _ngcontent-ryu-c178="" size="lg" class="ng-fa-icon test-icon text-secondary ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-question" class="svg-inline--fa fa-circle-question fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M256 0C114.6 0 0 114.6 0 256s114.6 256 256 256s256-114.6 256-256S397.4 0 256 0zM256 400c-18 0-32-14-32-32s13.1-32 32-32c17.1 0 32 14 32 32S273.1 400 256 400zM325.1 258L280 286V288c0 13-11 24-24 24S232 301 232 288V272c0-8 4-16 12-21l57-34C308 213 312 206 312 198C312 186 301.1 176 289.1 176h-51.1C225.1 176 216 186 216 198c0 13-11 24-24 24s-24-11-24-24C168 159 199 128 237.1 128h51.1C329 128 360 159 360 198C360 222 347 245 325.1 258z"></path></svg></fa-icon><!---->
    <span _ngcontent-ryu-c178="" class="task-name ng-star-inserted">getMinorsAmount</span><!---->
    
</div>
</jhi-programming-exercise-instructions-task-status></div>returns the number of under-age (younger than 5 years) penguins in the tree;</li>
<li><div class="pe-task-10 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-ryu-c178=""><div _ngcontent-ryu-c178="" class="guided-tour">
    <!---->
    <!---->
    <fa-icon _ngcontent-ryu-c178="" size="lg" class="ng-fa-icon test-icon text-secondary ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-question" class="svg-inline--fa fa-circle-question fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M256 0C114.6 0 0 114.6 0 256s114.6 256 256 256s256-114.6 256-256S397.4 0 256 0zM256 400c-18 0-32-14-32-32s13.1-32 32-32c17.1 0 32 14 32 32S273.1 400 256 400zM325.1 258L280 286V288c0 13-11 24-24 24S232 301 232 288V272c0-8 4-16 12-21l57-34C308 213 312 206 312 198C312 186 301.1 176 289.1 176h-51.1C225.1 176 216 186 216 198c0 13-11 24-24 24s-24-11-24-24C168 159 199 128 237.1 128h51.1C329 128 360 159 360 198C360 222 347 245 325.1 258z"></path></svg></fa-icon><!---->
    <span _ngcontent-ryu-c178="" class="task-name ng-star-inserted">getEvenNames</span><!---->
    
</div>
</jhi-programming-exercise-instructions-task-status></div>returns an array of all penguins whose name consists of an even number of characters.</li>
</ul></div>
</div><!---->
<!---->
</jhi-programming-exercise-instructions><!---->
