package lib

import (
	"fmt"
)

type vec struct {
	x, y int
}

func newVec(p1 []int, p2 []int) vec {
	return vec{x: p2[0] - p1[0], y: p2[1] - p1[1]}
}

func (v vec) DirTo(o vec) string {
	crossProduct := v.x*o.y - v.y*o.x
	if crossProduct == 0 {
		return "-"
	} else if crossProduct > 0 {
		return "L"
	}
	return "R"
}

func SayHi() {
	fmt.Println("I am solution")
}

func goThrough(di int, prePoint []int, vis []bool, cpath []int, preDir vec, ps [][]int, dirs string) []int {
	if di == len(dirs) {
		return cpath
	}
	for index, point := range ps {
		curDir := newVec(prePoint, point)
		if !vis[index] && preDir.DirTo(curDir) == dirs[di:di+1] {
			cpath = append(cpath, index)
			vis[index] = true
			path := goThrough(di+1, point, vis, cpath, curDir, ps, dirs)
			vis[index] = false
			cpath = cpath[0 : len(cpath)-1]
			if path != nil {
				return path
			}
		}
	}
	return nil
}

func visitOrder(points [][]int, direction string) []int {
	for si, start := range points {
		vis := make([]bool, len(points))
		vis[si] = true
		for index, point := range points {
			if !vis[index] {
				vis[index] = true
				path := goThrough(0, point, vis, []int{si, index}, newVec(start, point), points, direction)
				vis[index] = false
				if path != nil {
					return path
				}
			}
		}
		vis[si] = false
	}
	return nil
}

func VisitOrder(points [][]int, direction string) []int {
	return visitOrder(points, direction)
}
