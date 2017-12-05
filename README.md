# This is just a Spring boot demo built by the Spring boot initializer

_Created with Web and Jersey selected_

I've added in a Ping controller and a Date controller that reads a file
created by busybox in a shared container volume.

## To create Docker build

```bash
docker build -t="demo" .
```

## Create volume
```bash
docker create container-vol
```

## To run Docker image

Include the source volume created above.

```bash
docker run --mount source=container-vol,target=/var/container-vol -p 80:80 -i -t "demo"
```

# Busy box

```bash
docker pull busybox
```

## To run busybox writing into the shared volume
```bash
docker run --mount source=container-vol,target=/var/container-vol -it busybox /bin/sh -c "while true; do /bin/date > /var/container-vol/date; sleep 1; done"
```
