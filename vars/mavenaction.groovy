def call(string mavengoal){
            
                    sh " mvn clean ${mavengoal} "
                
            } 