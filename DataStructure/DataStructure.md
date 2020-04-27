#数据结构与算法

# *数据结构概念*

##概念与术语
 - 数据 Data
 - 数据元素 Data Element
 - 数据项 Data Item
 - 数据对象 Data Object
 - 结构 Structure
##数据结构的三要素
 
   > 数据结构是指数据元素之间的关系，时复杂数据的一种组织方式。  
   研究数据结构主要从3方面入手，这3方面成为数据结构的三要素：                
      1.数据的逻辑结构  
      2.数据存储结构  
      3.数据操作（算法）  
      
### 1.数据的逻辑结构    
   >数据的逻辑关系是指客观上数据对象之间具有的关系，这往往与具体应用需求相关。
        一个数据结构（逻辑结构）两个要素
            1.数据元素的集合
            2.要素关系的集合    
   + 集合结构    
       数据元素除去"同属于一个集合"之外，无其他关系                   
   + 线性结构     
      数据可以按照某种规则排列成线性表的形式。                                       
   + 树型结构     
      数据之间呈现倒立的树型结构，每个元素都有一个双亲，有0个或多个孩子。
      元素之间呈现一对多的关系。              
   + 网状结构   
      元素与元素之间可能有多个相邻的数据元素。
      数据元素之间呈现一种多对多的关系。
 
### 2.数据的存储结构    
   >数据的存储几个是指一批数据在计算机存储器中的存储位置和存储方式，其所研究的是数据的逻辑结构在计算机中的实现方法。  
    包括逻辑数据结构中数据元素的存储及数据元素之间关系存储。  
    存储结构的基本要求：存储结构必须能够反映数据元素本身之间及数据元素之间的逻辑关系。          
   + 顺序存储结构     
     将相邻的元素存储在物理位置相邻的存储单元中，由此得到的存储表示称为顺序存储结构。
     对于逻辑上的线性结构，采用顺序存储方式则为顺序表。          
   + 链式存储结构
     对数据元素在存储器中存放位置不做特殊要求，数据元素在存储器中可以随机存放。
     为了保持数据元素之间的逻辑关系，使用“指针”将每个数据元素联系起来。     
   + 索引存储
   
   + 散列存储 
      
### 3.数据的操作    
   > 作用于数据结构上的算法=数据结构的操作。不同的数据结构其算法和操作不同。  
   
   eg：查找、更新、插入、删除      

## 抽象数据类型
- ### 数据类型 Data Type

    数据类型可以分为两类：原子类型、结构类型。
        原子类型的值不可分解 
            eg： 整型int 字符型char 浮点型float 双精度型double 等基本类型
        结构类型的值由若干成分按某种结构组成，可分解

- ### 抽象数据类型 Abastract Data Type     
    + 抽象数据的概念
        
        >抽象数据类型是指一个数据结构以及定义在该结构上的一组操作。  
        抽象的意义在于数据类型的数学抽象性        
        * 抽象数据类型的特点
            
            1.由基本数据类型组成
            
            2.反映了数据的逻辑结构以及其在逻辑结构上定义的操作。
            
            3.一种抽象操作，独立于具体实现，抽象数据类型本身间数据和操作封装以实现信息隐蔽。
    
    + 抽象数据类型的描述方法
    
        * 抽象数据类型可以用三元组（D,S,P)表示，
        
            D 数据对象 S是D上的关系集，P是对D的基本操作
        
        * ADT抽象数据类型名
           {
             
           }          

---

# 1 集合结构

# 2 线性（表）结构 Linear List
> n个相同数据类型相同的元素的有限序列  
 线性结构是一种常见的逻辑结构，线性结构也称为线性表  
 线性表的主要存储结构：顺序存储和链式存储
## 顺序表
 > 把线性表的元素按照逻辑顺序一次存放在一组地址连续的存储单元，用这种顺序存储方法存储的线性表称为顺序表
   + 基本概念 
      - 特点：      
        * 只存储数据，不存储地址信息  
        * 内存中分配连续的空间        
      - 优点：      
        * 节省存储空间          
        * 索引查找效率高        
      - 缺点：
        * 插入和删除操作都需要移动元素
        * 必须提前分配固定数量的空间，如存储元素过少，会导致空闲浪费
      -复杂度
        * 时间复杂度        
                            
                    T(n)=(n-1)/2                
        * 空间复杂度
   + 顺序表其它         
###   + 数组

###   + Vector

###   + ArrayList

    
    
## 链式表 Linked List
 > 链表是线性表一组重要的存储方式  
   * 基本概念
   * 其他
### * 单链表    
### * 循环链表
 * 约瑟夫问题
   
 * 单向环形链表    
### * 双向链表
         
## 顺序表和链表的比较
 + 顺序表的优缺点
   1. 方法简单，各种高级语言都有数组，实现简单
   2. 无须为表示节点间的逻辑关系而增加额外的存储开销
   3. 顺序表具有按元素序号随机访问的特点
   4. 顺序序表中进行插入、删除操作时，平均移动大约表中一半的元素，因此对 n 较大的顺序表效率低。
   5. 需要预先分配足够大的存储空间，若预先估计过大，则可能会导致顺序表后部大量闲置；若预先分配过小，则又会造成溢出。
 + 链表的优缺点与顺序表基本相反  
   1. 链表的大小是动态的，随着数据的插入和删除而动态改变长度
   2. 链表的插入、删除非常高校，对于需要经常哈如、删除数据元素的应用，非常适合采用链表

## 特殊的线性结构
 
### 栈 Stack 
 - 基本介绍    
    1. 先进后出FILO的有序列表  
    2. 栈的限制性表中元素的插入和删除只能在线性表的同一端进行的一种特殊线性表  
    3. 变化的一端；栈底Bottom：固定的一端    
 - 应用场景     
    1. 子程序的调用  
    2. 处理递归Recursion调用
        - 概念
            1. 递归就是方法自己调用自己，每次调用时传入不同的变量，
            2. 递归有助于解决复杂问题，同时让代码更加整洁
        - 递归调用机制
            1. 
            2.
        - 递归准售的重要规则
            1. 执行方法时，就创建一个新的受保护的独立空间（栈空间）
            2. 方法的局部变量时独立的，不会相互影响比如n变量
            3. 如果方法中使用引用类型变量（数组），就会共享该引用类型数据
            4. 递归必须向退出递归的条件逼近，否则就是无限递归，出现StackOverflowError
            5. 当一个方法执行完毕，或者遇到return，就会返回。遵守谁调用，就将结构返回给谁，同时当方法执行完毕或返回时，该方法也就执行完毕
        - 递归解决问题
            1. 数学问题
                * 打印问题
                * 阶乘问题
                * 8皇后问题
                * 迷宫问题
                * 球和篮子
            2. 算法应用
                * 快排
                * 归并排序
                * 二分查找
                * 分治算法
            3. 用栈解决的问题
            
        -
        -
    3. 表达式的转换 [中缀表达式转后缀表达式] 和求值 
        +
        +            
    4. 二叉树的遍历
        +
        + 
    5. 图形的深度优先（deepth-first）搜索法
        +
        + 
 - 表达式求值
    + 后缀表达式
    + 常规表达式转换成后缀表达式
    +     
 1. 基本栈     
    + 插入和删除操作在表的同一端进行。栈顶 FILO/LIFO
    + 入栈            
      > top++；  
      stack [top]=data;
    + 出栈
      > int value=stack[top];  
      top--;  
      return value          
 2. 链栈： 栈的链表实现
    - 1
    - 2     
 3. 顺序栈：利用数组实现的栈
    - 1
    - 2
   
###  队列 Queue
 
 1.基本队列
    
 2.链式队列
    
 3.顺序队列
    
 4.循环队列
    
###  特殊矩阵
 
 1.二维数组
     
 2.对称矩阵和三角矩阵
     
 3.对角矩阵
     
 4.稀疏矩阵 Sparse Martrix
     
###  广义表 Generalized Lists
 
 
 
    

  

# 3 树结构
- ##树
- ##二叉树
- ##哈夫曼树

# 4 网状结构

---
## 线性查找算法
### 查找的基本概念
 + 查找结构
    - 查找
    - 插入
    - 删除
    - 更新
 + 查找结构分类
    - 逻辑结构分类
        * 线性查找结构
            线性查找结构主要有顺序表 链表 散列表
        * 树形查找结构
            - 二叉查找树
            - 多叉查找树
    - 查找结构内容分类
        + 静态查找结构
        + 动态查找结构
 + 平均查找长度ASL

### 线性查找表
 - 顺序查找
 - 二分查找
 - 分块查找

### 哈希查找

### 哈希映射

### 串匹配

## 排序算法