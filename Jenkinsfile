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
}	