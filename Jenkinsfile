node{
	stage ('scm checkout') {
		git 'https://github.com/cmcsoftware/write-microsevices'
	}
	stage ('Checkout to different branch') {
		sh "git branch -r"
		sh "git checkout master"
	}
	stage ('package stage') {
		sh label: '', script: 'mvn clean package'
	}
	
	stage ('docker image build') {
		sh 'docker build -t bunicool/write-microservice .'
	}
	
	stage ('docker image run') {
		sh 'docker run -d -p 8081:8080 --name write bunicool/write-microservice'
	}
}	
