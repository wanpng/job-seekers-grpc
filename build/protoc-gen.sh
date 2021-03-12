protoc --go_out=$GOPATH/src protos/domain/*.proto
protoc-go-inject-tag -input=grpc/domain/jobseeker.pb.go
protoc-go-inject-tag -input=grpc/domain/skill.pb.go
protoc-go-inject-tag -input=grpc/domain/education.pb.go
protoc-go-inject-tag -input=grpc/domain/training.pb.go
protoc-go-inject-tag -input=grpc/domain/work_experience.pb.go

protoc --go_out=$GOPATH/src protos/service/*.proto

protoc --go-grpc_out=$GOPATH/src protos/service/*.proto
