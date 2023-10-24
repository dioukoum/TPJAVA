	groupe_cc_083

    Membre 1:

    NOM    : SISSOKO
    PRENOM : Dioukou Moussa
    NUMERO : 22310113


    Membre 2:

    NOM    : ABOGOUNRIN
    PRENOM : Ayath
    NUMERO : 22310088


    -Les class exécutables sont : 

        -dans le package activities           : Main.java

        -dans le package basicconstraints     : Main.java

        -dans le package basictopologicalsort : Main.java


    -Les class de test sont     :

        -dans le package activities           : Test.java

        -dans le package basicconstraints     : ConstraintTest.java (-> pour la class PrecedenceConstraint.java)
                                                MeetTest.java       (-> pour la class MeetConstraint.java)

        -dans le package basictopologicalsort : Test.java



    -Codes de compilation :

        -pour le package activities            : javac -d build -cp lib/schedulestests.jar src/schedules/activities/*.java

        -pour le package basicconstraints      : javac -d build/ -cp lib/schedulestests.jar src/schedules/basicconstraints/*.java src/schedules/activities/*.java

        -pour le package basictopologicalsort  : javac -d build/ -cp lib/schedulestests.jar src/schedules/basictopologicalsort/*.java src/schedules/activities/*.java src/schedules/basicconstraints/*.java



    -Codes d'execution :

        -pour le package activities             : java -cp build/:lib/schedulestests.jar schedules.activities.Main

        -pour le package basicconstraints       : java -cp build/:lib/schedulestests.jar schedules.basicconstraints.Main

        -pour le package basictopologicalsort   : java -cp build/:lib/schedulestests.jar schedules.basictopologicalsort.Main


    -Codes d'execution des tests:

        -pour le package activities             : java -cp build/:lib/schedulestests.jar schedules.activities.Test

        -pour le package basicconstraints       : java -cp build/:lib/schedulestests.jar schedules.basicconstraints.ConstraintTest
                                                  java -cp build/:lib/schedulestests.jar schedules.basicconstraints.MeetTest

        -pour le package basictopologicalsort   : java -cp build/:lib/schedulestests.jar schedules.basictopologicalsort.Test