{\rtf1\ansi\ansicpg1252\cocoartf2636
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red15\green112\blue1;\red255\green255\blue255;\red0\green0\blue0;
\red0\green0\blue255;\red32\green108\blue135;\red101\green76\blue29;\red0\green0\blue109;\red157\green0\blue210;
\red19\green118\blue70;}
{\*\expandedcolortbl;;\cssrgb\c0\c50196\c0;\cssrgb\c100000\c100000\c100000;\cssrgb\c0\c0\c0;
\cssrgb\c0\c0\c100000;\cssrgb\c14902\c49804\c60000;\cssrgb\c47451\c36863\c14902;\cssrgb\c0\c6275\c50196;\cssrgb\c68627\c0\c85882;
\cssrgb\c3529\c52549\c34510;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs26 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 //Time complexity is O(log n)\cf0 \cb1 \strokec4 \
\cf2 \cb3 \strokec2 //Space complexity is O(1)\cf0 \cb1 \strokec4 \
\cf2 \cb3 \strokec2 //able to submit code in leetcode\cf0 \cb1 \strokec4 \
\pard\pardeftab720\partightenfactor0
\cf5 \cb3 \strokec5 class\cf0 \strokec4  \cf6 \strokec6 Solution\cf0 \strokec4  \{\cb1 \
\pard\pardeftab720\partightenfactor0
\cf0 \cb3     \cf5 \strokec5 public\cf0 \strokec4  \cf6 \strokec6 int\cf0 \strokec4 [] \cf7 \strokec7 searchRange\cf0 \strokec4 (\cf6 \strokec6 int\cf0 \strokec4 [] \cf8 \strokec8 nums\cf0 \strokec4 , \cf6 \strokec6 int\cf0 \strokec4  \cf8 \strokec8 target\cf0 \strokec4 ) \{\cb1 \
\cb3         \cf6 \strokec6 int\cf0 \strokec4  \cf8 \strokec8 i\cf0 \strokec4  = \cf7 \strokec7 helper\cf0 \strokec4 (nums, target);\cb1 \
\cb3         \cf9 \strokec9 if\cf0 \strokec4 (i==-\cf10 \strokec10 1\cf0 \strokec4 )\cb1 \
\cb3         \{\cb1 \
\cb3             \cf9 \strokec9 return\cf0 \strokec4  \cf9 \strokec9 new\cf0 \strokec4  \cf6 \strokec6 int\cf0 \strokec4 []\{-\cf10 \strokec10 1\cf0 \strokec4 , -\cf10 \strokec10 1\cf0 \strokec4 \};\cb1 \
\cb3         \}\cb1 \
\cb3         \cf6 \strokec6 int\cf0 \strokec4  \cf8 \strokec8 j\cf0 \strokec4  = i+\cf10 \strokec10 1\cf0 \strokec4 ;\cb1 \
\cb3         \cf9 \strokec9 while\cf0 \strokec4 (i>=\cf10 \strokec10 0\cf0 \strokec4  && nums[i]==target)\{\cb1 \
\cb3             i = i-\cf10 \strokec10 1\cf0 \strokec4 ;\cb1 \
\cb3         \}\cb1 \
\cb3         \cf9 \strokec9 while\cf0 \strokec4 (j<\cf8 \strokec8 nums\cf0 \strokec4 .\cf8 \strokec8 length\cf0 \strokec4  && nums[j]==target)\{\cb1 \
\cb3             j = j+\cf10 \strokec10 1\cf0 \strokec4 ;\cb1 \
\cb3         \}\cb1 \
\cb3         \cf9 \strokec9 return\cf0 \strokec4  \cf9 \strokec9 new\cf0 \strokec4  \cf6 \strokec6 int\cf0 \strokec4 []\{i+\cf10 \strokec10 1\cf0 \strokec4 , j-\cf10 \strokec10 1\cf0 \strokec4 \};\cb1 \
\cb3     \}\cb1 \
\cb3     \cf5 \strokec5 public\cf0 \strokec4  \cf6 \strokec6 int\cf0 \strokec4  \cf7 \strokec7 helper\cf0 \strokec4 (\cf6 \strokec6 int\cf0 \strokec4 [] \cf8 \strokec8 nums\cf0 \strokec4 , \cf6 \strokec6 int\cf0 \strokec4  \cf8 \strokec8 target\cf0 \strokec4 )\{\cb1 \
\cb3         \cf6 \strokec6 int\cf0 \strokec4  \cf8 \strokec8 l\cf0 \strokec4 =\cf10 \strokec10 0\cf0 \strokec4 ;\cb1 \
\cb3         \cf6 \strokec6 int\cf0 \strokec4  \cf8 \strokec8 r\cf0 \strokec4  = \cf8 \strokec8 nums\cf0 \strokec4 .\cf8 \strokec8 length\cf0 \strokec4 -\cf10 \strokec10 1\cf0 \strokec4 ;\cb1 \
\cb3         \cf9 \strokec9 while\cf0 \strokec4 (l<=r)\{\cb1 \
\cb3             \cf6 \strokec6 int\cf0 \strokec4  \cf8 \strokec8 m\cf0 \strokec4  = l+(r-l)/\cf10 \strokec10 2\cf0 \strokec4 ;\cb1 \
\cb3             \cf9 \strokec9 if\cf0 \strokec4 (nums[m]==target)\{\cb1 \
\cb3                 \cf9 \strokec9 return\cf0 \strokec4  m;\cb1 \
\cb3             \}\cb1 \
\cb3             \cf9 \strokec9 else\cf0 \strokec4  \cf9 \strokec9 if\cf0 \strokec4 (nums[m]<target)\{\cb1 \
\cb3                 l=m+\cf10 \strokec10 1\cf0 \strokec4 ;\cb1 \
\cb3             \}\cb1 \
\cb3             \cf9 \strokec9 else\cf0 \cb1 \strokec4 \
\cb3             \{\cb1 \
\cb3                 r= m-\cf10 \strokec10 1\cf0 \strokec4 ;\cb1 \
\cb3             \}\cb1 \
\cb3         \}\cb1 \
\cb3         \cf9 \strokec9 return\cf0 \strokec4  -\cf10 \strokec10 1\cf0 \strokec4 ;\cb1 \
\cb3     \}\cb1 \
\cb3 \}\cb1 \
}