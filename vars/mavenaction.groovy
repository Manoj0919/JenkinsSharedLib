def call(String mavengoal){
            
                    sh " mvn clean ${mavengoal} "
                
            } 