����   4 �  #rw/ac/onbank/orm/helpers/Navigation  %rw/ac/onbank/orm/superclasses/Scanner printer 4Lrw/ac/onbank/orm/helpers/MessagesAndOptionsPrinter; choice I user  Lrw/ac/onbank/orm/entities/User; <init> ()V Code
      2rw/ac/onbank/orm/helpers/MessagesAndOptionsPrinter
  	    	      rw/ac/onbank/orm/entities/User
  	   	 
 LineNumberTable LocalVariableTable this %Lrw/ac/onbank/orm/helpers/Navigation; 
checkEmail (Ljava/lang/String;)V
 # % $ java/lang/String & ' length ()I ) '				 Error : please provide valid email
  + , ! 	printLine . Email
  0 1 2 generateInputs &(Ljava/lang/String;)Ljava/lang/String;
  4 5 ! setEmail email Ljava/lang/String; StackMapTable checkPassword ; )Password should be at least  8 characters = Password
  ? @ ! setPassword password checkSecurityAnswer
  D E ! setSecurityAnswer answer checkSecurityQuestion
  I J ! setSecurityQuestion question checkFirstName
  N O ! setFirstName 	firstName checkSecondName
  S T ! setLastName 
secondName getUser "()Lrw/ac/onbank/orm/entities/User; Y  
 # [ \ ' hashCode ^ 
SecondName
 # ` a b equals (Ljava/lang/Object;)Z d securityAnswer f securityQuestion h 	FirstName j Enter your email
  l m ! print
  o p q 
getScanner ()Ljava/util/Scanner;
 s u t java/util/Scanner v w nextLine ()Ljava/lang/String;
  y   ! { Enter your password
  } 9 !  Enter your FirstName
  � L ! � Enter your SecondName
  � Q ! � Enter your security question
  � G ! � Enter your security answer
  � B ! � Please choose the right choice field value printHomeChoices � You are registered successfully � #What do we you want to do for you?  � My account  � Create account  � Delete my account � Logout � Add an account
  � � � printChoices ([Ljava/lang/String;)V
 s � � ' nextInt � Check my balance � Deposit money � Withdraw money � 
Get a loan � SWarning : By deleting your account all  your staffs including balance will be lost  � >Are you sure you want to delete this account  Y(yes) or N(no)? � y � yes � YES � %You deleted your account successfully � not deleted options2 [Ljava/lang/String; options3 � 
SourceFile Navigation.java !                   	 
   
        Z      *� *� Y� � *� *� Y� � �                 	                   !     t     '+� "� *� (� **� *-� /� 3*� +� 3�                  &         '       ' 6 7  8      9 !     u     (+� "� *� :� **� *<� /� >*� +� >�            	      '         (       ( A 7  8      B !     A     	*� +� C�       
              	       	 F 7   G !     A     	*� +� H�       
              	       	 K 7   L !     A     	*� +� M�       
       !        	       	 P 7   Q !     A     	*� +� R�       
    #  $        	       	 U 7   V W     /     *� �           &              1 2    �    -XM+YN� Z�       ��?   ;�[3   G�[|   S%��F   _Ld�   k]	;   w-]� _� �� �-c� _� �� �--� _� *� �-e� _� �� �-<� _� +� �-g� _� 8� �*� i� k*� n� rM*,� x� �*� z� k*� n� rM*,� |� p*� ~� k*� n� rM*,� �� W*� �� k*� n� rM*,� �� >*� �� k*� n� rM*,� �� %*� �� k*� n� rM*,� �� *� �� k,�       r    )  * � , � - � . � / � 1 � 2 � 3 � 4 � 6 � 7 � 8 � 9 � ; � < � = � > � @ � A B C	 E F G H" J+ M        -      - � 7  * � 7  8    � D # #�   �     |     �*� �� k*� X� k*� �� *� #Y�SY�SY�SY�SY�SL*� +� �**� n� �� *� �      �            <� #Y�SY�SY�SY�SM*� ,� �� `*� �� **� �� **� n� r�� -*� n� r�� !*� n� r�� *� n� r� Z�� Z� *� �� *� *� �� *�       F    P 	 Q  R  S 9 T A U L V h X � Y � Z � \ � ] � ^ � _ � a � b � e         �     9 � � �  �  � �  8    � h �#� G  �    �